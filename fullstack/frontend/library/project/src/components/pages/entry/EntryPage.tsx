import { Link } from 'react-router-dom'
import './entry.css'
import { Button, Paper } from '@mui/material'
export const Entrypage=()=>{
    return <div className="entry-container">
        <Paper>
            <div style={{margin:'30px',padding:'40px'}}>
        <h1>Select where do you want to go</h1>
        <div className='entry-content'>
           <Link to={'/lessons'}>
           <Button variant="contained" >Lessons</Button></Link>
           <Link to={"/pro/login"}>
           <Button variant="contained" color='warning'>Project</Button>
           </Link>
        </div>
        </div>
        </Paper>
    </div>
}