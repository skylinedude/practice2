import { Button, Grid, Paper, TextField } from "@mui/material"
import "./register.css"
import { useState } from "react"
import { Link } from "react-router-dom"
export const Register: React.FC<{}> = () => {
    let [email,setEmail]=useState("")
    let [name,setName]=useState("")
    let [password,setPassword]=useState("")
    //calling api
    let handelclick=()=>{
alert(email+"----"+password+"---"+name)
    }
    return <div className="register-container">
        <Paper>
            <div style={{ margin: '30px', padding: '40px' }}>

                <Grid
                    container
                    direction="column"
                    justifyContent="space-between"
                    alignItems="center"
                >
                    <h1>Register page</h1>
                    <br />
                    <TextField id="outlined-basic" label="name" variant="outlined" onChange={(e:any)=>{setName(e.target.value)}}/>
                    <br />
                    <TextField id="outlined-basic" label="email" variant="outlined" onChange={(e:any)=>{setEmail(e.target.value)}}/>
                    <br />
                    <TextField id="outlined-basic" label="password" variant="outlined" onChange={(e:any)=>{setPassword(e.target.value)}}/>
                    <br />
                    <Button variant="contained" onClick={handelclick}>Register</Button>
                    <Link to={"/pro/login"}>
                    <Button variant="text">login</Button></Link>
                </Grid>


            </div>
        </Paper>
    </div>
}