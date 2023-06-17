package Study_Myself;

public class Quize_Get_Set {

        //기존에 쓰는 코드
        private String name;
        private String age;
        private String phoneNum;
        private String gender;

        //private 값을 받아오거나 입력하기 위해
        //get 과 set 이라는 변수명을 따로 만들어
        //public 된 메소드를 활용하여 불러왔음.

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }
        public void setAge(String age){
            this.age = age;
        }

        public String getPhoneNum() {
            return phoneNum;
        }
        public void setPhoneNum(String phoneNum){
            this.phoneNum = phoneNum;
        }

        public String getGender() {
            return gender;
        }
        public void setGender(String gender){
            gender = gender;
        }
    }