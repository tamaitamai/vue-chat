<template>
    <div id="app">
        <TopHeader></TopHeader>
        <RouterView></RouterView>
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
</style>
