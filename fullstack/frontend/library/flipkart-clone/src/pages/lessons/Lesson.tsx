import { TabContext, TabList, TabPanel } from "@mui/lab"
import { Tab } from "@mui/material"
import { useState } from "react"
import { MyUseState } from "../../hooks/MyUseState"

export const Lessons=()=>{
    let [state,setState]=useState("1")
    //let state="2"
    return <>
   <center><h1>all my lessons</h1></center> 
    <div>
        <TabContext value={state} >
            <TabList onChange={(item,idx)=>{
                setState(idx)
            }}>
            <Tab label="useState" value={"1"}/>
            <Tab label="lessons2" value={"2"}/>
            </TabList>
          <TabPanel value="1">
          <MyUseState/>
          </TabPanel>
          <TabPanel value="2">
            lessons2
          </TabPanel>

        </TabContext>

    </div>
    
    </>
}