import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
// import Antd from 'ant-design-vue';
// import 'ant-design-vue/dist/antd.css';
import axios from 'axios';

const app = createApp(App)

// app.use(axios)
app.use(ElementPlus)
// app.use(Antd);
app.use(router)
app.mount('#app')

// createApp(App).use(router).mount('#app')
