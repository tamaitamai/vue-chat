<template>
    <div>ここがホーム</div>
</template>
<script setup>
import { otamesi } from '@/utils';
import { onMounted } from 'vue';

console.log('ホーム')
onMounted(()=>{
    console.log('ホームです')
    otamesi()
})
</script>