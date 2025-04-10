<template>
    <div id="app">
        <main v-show="$route.meta.showHeader">
            <TopHeader></TopHeader>
            <RouterView></RouterView>
        </main>
        <RouterView v-show="!$route.meta.showHeader"></RouterView>
    </div>
</template>

<script>
import TopHeader from './components/main/TopHeader.vue';

export default {
    name: 'App',
    components: {
        TopHeader
    }
}
</script>

<style>
html, body, #app{
    height: 100%;
    margin: 0;
    padding: 0;
}
main{
    display: flex;
    height: 100%;
    margin: 0;
    overflow: hidden;
}
</style>
<style src="./css/style.css"></style>
