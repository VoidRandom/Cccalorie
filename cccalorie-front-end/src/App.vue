<template>
  <div id="app">
    <el-container>
      <el-header>Header</el-header>
      <el-container class='content'>
        <el-aside width="10%">Aside</el-aside>
        <el-main>Main</el-main>
      </el-container>
    </el-container>
  </div>
</template>

<style lang="less">
.el-header {
  background-color: #b3c0d1;
  color: #333;
  text-align: center;
  line-height: 60px;
}

.el-aside {
  display: inline-block;
  background-color: #d3dce6;
  color: #333;
  text-align: center;
  line-height: 600px;
}

.el-main {
  display: inline-block;
  width: 90%;
  background-color: #e9eef3;
  color: #333;
  text-align:center;
  line-height: 600px;
}

body > .el-container {
  margin-bottom: 40px;
}
</style>
