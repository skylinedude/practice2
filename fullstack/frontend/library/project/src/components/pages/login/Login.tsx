import { Button, Grid, Paper, TextField } from "@mui/material"
import "./login.css"
import { useState } from "react"
import { Link, useNavigate } from "react-router-dom"
export const Login: React.FC<{}> = () => {
    let navigate=useNavigate()
    let [email,setEmail]=useState("")
    let [password,setPassword]=useState("")
    //calling api
    let handelclick=()=>{
alert(email+"----"+password)
navigate("/pro/home")
    }
    return <div className="login-container">
        <Paper>
            <div style={{ margin: '30px', padding: '40px' }}>

                <Grid
                    container
                    direction="column"
                    justifyContent="space-between"
                    alignItems="center"
                >
                    <h1>login page</h1>
                    <br />
                    <TextField id="outlined-basic" label="email" variant="outlined" onChange={(e:any)=>{setEmail(e.target.value)}}/>
                    <br />
                    <TextField id="outlined-basic" label="password" variant="outlined" onChange={(e:any)=>{setPassword(e.target.value)}}/>
                    <br />
                    <Button variant="contained" onClick={handelclick}>Login</Button>
                    <Link to={"/pro/register"}>
                    <Button variant="text">Register</Button></Link>
                </Grid>


            </div>
        </Paper>
    </div>
}