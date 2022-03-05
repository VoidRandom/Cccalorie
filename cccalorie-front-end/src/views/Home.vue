<template>
  <el-main class="home">
    <div class="add-info">
      <el-form :inline="true" :model="calorieInfo" class="demo-form-inline">
        <el-form-item label="食物/运动名称">
          <el-input v-model="calorieInfo.name" placeholder="信息名称"></el-input>
        </el-form-item>
        <el-form-item label="类型">
          <el-select v-model="calorieInfo.type" placeholder="类型">
            <el-option label="食物" value="food"></el-option>
            <el-option label="运动" value="sports"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="热量">
          <el-input v-model.number="calorieInfo.calorie" placeholder="热量,食物为正，运动为负"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="onSubmit">提交</el-button>
        </el-form-item>
      </el-form>
    </div>
  </el-main>
</template>

<script>
// @ is an alias to /src
import axios from 'axios'
import qs from 'qs'

export default {
  name: 'Home',
  data () {
    return {
      calorieInfo: {
        name: '',
        calorie: null,
        type: ''
      },
      baseUrl: 'http://'
    }
  },
  methods: {
    onSubmit () {
      this.sumbitInfo()
    },
    async sumbitInfo () {
      const type = this.calorieInfo.type
      let url = this.baseUrl + '/api'
      if (type === 'food') {
        url += '/add_food'
      } else {
        url += '/add_sports'
      }

      const params = {
        name: this.calorieInfo.name,
        calorie: this.calorieInfo.calorie
      }
      console.log(params)
      const {
        data: res,
        status: state
      } = await axios.post(url, qs.stringify(params))
      console.log(res)
      console.log(state)
    }
  }
}
</script>
