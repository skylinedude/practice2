import { useAdd } from "../hooks/add.hook"


export const Calculator=()=>{
    let [num1,num2,sum,sub]=useAdd(2,4)
   
    console.log()
    return <>
    <h1>hooks custom</h1>
    {num1}{num2}{sum+"  "+sub}
    </>
}