import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
// import HomeView from '../views/HomeView.vue'
import listBo from '../views/list_bo/list-bo.vue'
import listicon from '../views/list-icon/list-icon.vue'
import listshow from '../views/list-show/list-show.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'home',
    component: listBo,
    children: [
      {
        path: '/add', // 子路由路径
        name: 'add',
        component: listicon // 子路由组件
      },
      {
        path: '/show', // 子路由路径
        name: 'show',
        component: listshow // 子路由组件
      },
    ]
  }
]
//   {
//     path: '/',
//     name: 'home',
//     component: listBo ,
//     children: [
//       {
//         path: '/add', // 子路由路径
//         name: 'add',
//         component: listicon, // 子路由组件
//       },},
// //  {
// //   path:'/add',
// //   name: 'add',
// //   component: listicon
// //  }
// ]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
