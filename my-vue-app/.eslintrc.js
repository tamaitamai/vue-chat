module.exports = {
    root: true,
    env: {
      node: true,
    },
    extends: [
      'plugin:vue/vue3-essential',
      'eslint:recommended',
    ],
    parserOptions: {
      parser: '@babel/eslint-parser',
      requireConfigFile: false,
    },
    rules: {
    },
    globals: {
      defineEmits: 'readonly',
      defineProps: 'readonly',
      defineExpose: 'readonly',
    },
  };
  