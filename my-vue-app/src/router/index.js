import HomeView from "@/components/main/HomeView.vue";
import MemberView from "@/components/member/MemberView.vue";
import ShareView from "@/components/share/ShareView.vue";
import TalkView from "@/components/talk/TalkView.vue";
import InsertView from "@/components/user/InsertView.vue";
import LoginView from "@/components/user/LoginView.vue";
import { createRouter, createWebHistory } from "vue-router";

const router = new createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/',
            name: 'home',
            component: HomeView,
            meta: { showHeader: true }
        },
        {
            path: '/login',
            name: 'login',
            component: LoginView,
            meta: { showHeader: false }
        },
        {
            path: '/insert',
            name: 'insert',
            component: InsertView,
            meta: { showHeader: false }
        },
        {
            path: '/member',
            name: 'member',
            component: MemberView,
            meta: { showHeader: true }
        },
        {
            path: '/talk',
            name: 'talk',
            component: TalkView,
            meta: { showHeader: true }
        },
        {
            path: '/share',
            name: 'share',
            component: ShareView,
            meta: { showHeader: true }
        }
    ]
    
})
export default router