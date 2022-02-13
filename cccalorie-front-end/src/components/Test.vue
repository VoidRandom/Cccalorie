<template>
  <button type="button" @click="getAllFoodInfo">Test</button>
</template>

<script>
import axios from 'axios'
export default {
  name: 'Test',
  methods: {
    async getAllFoodInfo () {
      const res = await axios.get('http://localhost:8080/api/all_food')
      console.log(res)
    }
  }
}
</script>

<style scoped>

</style>
