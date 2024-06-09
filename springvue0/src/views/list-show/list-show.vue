<template>
    <el-table :data="tableData" style="width: 100%">
      <el-table-column prop="nickname" label="昵称" width="100" />
      <el-table-column prop="email" label="邮箱" width="250" />
      <el-table-column prop="comment" label="评论" />
    </el-table>
  
    <!-- <el-button type="primary" @click="getdata()">获取数据</el-button>
    <el-button type="primary" @click="a">获取数据</el-button> -->
  </template>
  
  <script lang="ts" setup>
  import axios from 'axios';
  import { ref, reactive, onMounted } from 'vue';
//   const tableData = reactive({ values: [] });
//   let tableData = reactive([]);
const tableData = reactive([]);

const dddd = tableData.values


  const a = ()=>{
    console.log(tableData)
    console.log(tableData.values)
    console.log(dddd)
  }


//   const Data = [
//     {
//       comment: '2016-05-03',
//       nickname: 'Tom',
//       email: 'No. 189, Grove St, Los Angeles',
//     },
//   ]
//   const getdata = async () => {
//     try {
//       const response = await axios.get('http://localhost:8188/Com/findAll');
//       console.log(response.data);
//       tableData.values=response.data;

//     } catch (error) {
//       console.error('Error fetching data:', error);
//     }
//   };
const getdata = async () => {
  try {
    const response = await axios.get('http://localhost:8188/Com/findAll');
    tableData.splice(0, tableData.length, ...response.data); // 更新 tableData 中的数据
  } catch (error) {
    console.error('Error fetching data:', error);
  }
};
  onMounted(getdata); 
  </script>
  


<!-- <template>
    <el-table :data="tableData" style="width: 100%">
      <el-table-column prop="date" label="昵称" width="180" />
      <el-table-column prop="name" label="邮箱" width="180" />
      <el-table-column prop="address" label="评论" />
    </el-table>

    <el-button type="primary" @click="getdata()">ss</el-button>
  </template>
  
  <script lang="ts" setup>
  import axios from 'axios';
  import { ref,reactive  } from 'vue';
  


  let data = reactive([{id:1},{id:2}])



  const getdata = async () => {
    try {
        const response = await axios.get('http://localhost:8188/Com/findAll');
        console.log(response.data);
        if (response.data.code === 200) {
            console.log('Data fetched successfully');
            // 这里可以进行其他操作，比如跳转页面等
        } else {
            console.error('Error:', response.data.message);
            // 这里可以处理错误，比如显示错误信息等
        }
    } catch (error) {
        console.error('Error fetching data:', error);
        // 这里可以处理请求失败的情况，比如显示错误信息等
    }
};


  const tableData = [
    {
      date: '2016-05-03',
      name: 'Tom',
      address: 'No. 189, Grove St, Los Angeles',
    },
    {
      date: '2016-05-02',
      name: 'Tom',
      address: 'No. 189, Grove St, Los Angeles',
    },
    {
      date: '2016-05-04',
      name: 'Tom',
      address: 'No. 189, Grove St, Los Angeles',
    },
    {
      date: '2016-05-01',
      name: 'Tom',
      address: 'No. 189, Grove St, Los Angeles',
    },
  ]

  </script>
   -->