<template>
    <el-form :model="form" label-width="auto" style="max-width: 600px">
      <el-form-item label="昵称">
        <el-input v-model="form.nickname" />
      </el-form-item>
  
      <el-form-item label="联系邮箱">
        <el-input v-model="form.email" />
      </el-form-item>
  
      <el-form-item label="评论">
        <el-input v-model="form.comment" type="textarea" />
      </el-form-item>
  
      <el-form-item>
        <el-button type="primary" @click="onSubmit">提交</el-button>
        <el-button @click="resetForm">重置</el-button>
      </el-form-item>
    </el-form>
  </template>
  
  <script lang="ts" setup>
  import axios from 'axios';
  import { reactive } from 'vue';
  
  interface UserData {
    comment: string;
    email: string;
    nickname: string;
  }
  
  const form = reactive<UserData>({
    comment: '',
    email: '',
    nickname: ''
  });
  
  const onSubmit = async () => {
    try {
      const response = await axios.post('http://localhost:8188/Com/addCom', form);
      console.log('Data posted successfully:', response.data);
      // 在这里可以根据需要处理成功的情况
    } catch (error) {
      console.error('Error posting data:', error);
      // 在这里可以处理请求失败的情况，比如显示错误信息等
    }
  };
  
  const resetForm = () => {
    // 重置表单
    form.comment = '';
    form.email = '';
    form.nickname = '';
  };
  </script>

<!-- <template>
    <el-form :model="form" label-width="auto" style="max-width: 600px">
      <el-form-item label="昵称">
        <el-input v-model="form.nickname" />
      </el-form-item>

      <el-form-item label="联系邮箱">
        <el-input v-model="form.email" />
      </el-form-item>

      <el-form-item label="评论">
        <el-input v-model="form.comment" type="textarea" />
      </el-form-item>

      <el-form-item>
        <el-button type="primary" @click="onSubmit">提交</el-button>
        <el-button>重置</el-button>
      </el-form-item>
    </el-form>
  </template>
  
  <script lang="ts" setup>
  import axios from 'axios';
  import { reactive } from 'vue'


  interface UserData {
    comment: string;
    email: string;
    // id: number;
    nickname: string;
}

const postData = async (userData: UserData, url: string) => {
    try {
        const response = await axios.post(url, userData);
        console.log('Data posted successfully:', response.data);
        // 在这里可以根据需要处理成功的情况
    } catch (error) {
        console.error('Error posting data:', error);
        // 在这里可以处理请求失败的情况，比如显示错误信息等
    }
};

// 使用示例
const userData: UserData = {
    comment: "20",
    email: "1428623823@QQ.com",
    nickname: "李博"
};

const apiUrl = 'http://localhost:8188/Com/addCom'; // 将此处替换为实际的接口地址
postData(userData, apiUrl);
//   const getdata = async() => {
//     // const username: string = LoginUsername.value;
//     // const password: string = LoginPassword.value;

//     axios.post('http://localhost:8080/user/login', {
//         username,
//         password
//       }).then(res => {
//               console.log(res.data)
//               if(res.data.code == 200){
//                   router.push('/index')
//               }
//               else
//               {
//                   ElMessage.error(res.data.message)
//               }

//           } 
//       )
//   }
  
  // do not use same name with ref
  const form = reactive({
    name: '',
    region: '',
    date1: '',
    date2: '',
    delivery: false,
    type: [],
    resource: '',
    desc: '',
  })
  
  const onSubmit = () => {
    console.log('submit!')
  }
  </script> -->