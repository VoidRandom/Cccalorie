<template>
  <div id="app">
    <el-container>
      <el-header height="100px">
        <img src="../src/assets/logo.png" alt="" width="100px" height="100px">
        <div class="user-info">
          登录 注册 用户
        </div>
      </el-header>
      <el-container class='content'>
        <el-aside width="10%">
          <ul>
            <li class="func-item" v-for="item in funclist" :key="item.name">
              <router-link :to="item.router">{{ item.name }}</router-link>
            </li>
          </ul>
        </el-aside>
          <router-view></router-view>
      </el-container>
    </el-container>
  </div>
</template>

<script>
export default {
  data () {
    return {
      funclist: [
        {
          name: '首页', router: '/'
        },
        {
          name: '用户', router: '/user'
        },
        {
          name: '关于', router: '/about'
        }
      ]
    }
  }
}
</script>
<style lang="less">
#app{
  width: 1200px;
}
ul, li {
  padding: 0;
  margin: 0;
}

li {
  list-style: none;
  height: 200px;
  line-height: 200px;
}

.user-info {
  float: right;
  width: 200px;
  height: 100px;
}

.el-header {
  background-color: #b3c0d1;
  color: #333;
  text-align: center;
  line-height: 60px;

  img {
    float: left;
    margin-left: 45%;
  }
}

.el-aside {
  float: left;
  background-color: #d3dce6;
  color: #333;
  text-align: center;
  height: 600px;
}

a {
  text-decoration: none;
}

.el-main {
  float: left;
  width: 90%;
  background-color: #e9eef3;
  color: #333;

  height: 600px;
}

body > .el-container {
  margin-bottom: 40px;
}
</style>
