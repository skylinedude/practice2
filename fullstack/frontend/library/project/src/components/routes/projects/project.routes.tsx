import { Outlet } from "react-router-dom";
import { Login } from "../../pages/login/Login";
import { Register } from "../../pages/register/Register";
import { Home } from "../../pages/home/Home";


export let proRoutes={
    path:'/pro',
    element:<><Outlet/></>,
    children:[
       {path:'login',element:<Login/>},
       {path:'register',element:<Register/>},
       {path:'home',element:<Home/>},
    ]
}
   