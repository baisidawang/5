<template>
  <div>
<h1>李博留言板</h1>
<el-button type="primary" index="/show"><router-link to="/show">展示评论</router-link></el-button>
<el-button type="primary" index="/add"><router-link to="/add">添加评论</router-link></el-button>
<br />
    <el-config-provider >
      <router-view/>
    </el-config-provider>
  </div>
</template>

<script lang="ts" setup>
import { ref,reactive  } from 'vue';
</script>
