
interface Iobj{
    a:any
    b:any
    c?:any
    d?:any
}
export let obj: Iobj={a:'heelo',b:2}
console.log(obj)
obj.c="cat"
console.log(obj)
obj.d="cat"




