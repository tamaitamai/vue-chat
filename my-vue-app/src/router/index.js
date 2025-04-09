import HomeView from "@/components/main/HomeView.vue";
import InsertView from "@/components/user/InsertView.vue";
import LoginView from "@/components/user/LoginView.vue";
import { createRouter, createWebHistory } from "vue-router";

const router = new createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/',
            name: 'home',
            component: HomeView
        },
        {
            path: '/login',
            name: 'login',
            component: LoginView
        },
        {
            path: '/insert',
            name: 'insert',
            component: InsertView
        }
    ]
    
})
export default router