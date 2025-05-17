import { createStore } from "vuex";

const store = createStore({
    state: {
        userData: null,
    },
    mutations: {
        setUserData(state, data) {
            state.userData = data;
        }
    },
    actions: {
        updateUserData({ commit }, data) {
            commit('setUserData', data);
        }
    },
    getters: {
        getUserData: (state) => state.userData,
    }
});

export default store;

