import { Box, Button, Card, CardActions, CardContent, Grid, Paper, Typography } from "@mui/material"
import { useEffect, useState } from "react"
import {allNotes} from 'take-notes'
export const TakeNotes:React.FC<{}>=()=>{
    console.log(allNotes.all())
    let [notes,setNotes]=useState<any>([])
    useEffect(()=>{
        setNotes(allNotes.all())
        
    },[])

    return <>
    <h1>ur notes</h1>
    <Paper>
    <Grid
  container
  direction="row"
  justifyContent="pace-between"
  alignItems="center"
>
    {notes.map((e:any)=>{ return <Box sx={{ minWidth: 275,padding:'10px' }} >
      <Card variant="outlined">

      <>
          <CardContent>
            <Typography sx={{ fontSize: 14 }} color="text.secondary" gutterBottom>
              teacher notes
            </Typography>

            <Typography sx={{ mb: 1.5,color:'red'}} >
            author:----<h3 style={{display:'inline'}}>{e.studentName}</h3> 
            </Typography>
            <Typography sx={{ mb: 1.5 }} color="text.secondary">
              language:----{e.language}
            </Typography>
            <Typography variant="body2">
             topic---:{e.topic}

            </Typography>
          </CardContent>
          <CardActions>
            <a href={e.fileUrl}>
            <Button size="small">download</Button>
            </a>
            
          </CardActions>
        </>
      </Card>
    </Box>})}

</Grid>
    </Paper>


    </>
}