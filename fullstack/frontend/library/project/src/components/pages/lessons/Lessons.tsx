import { TabContext, TabList, TabPanel } from "@mui/lab"
import { Grid, Tab } from "@mui/material"
import { useState } from "react"
import { MyUseState } from "../../hooks/MyUseState"
import { StarRating } from "../../mui/StarRating"
import { Calculator } from "../../Calculator/Calculator"
import { Parent } from "../../props/Parent"
import { CardContainer } from "../../dyanamicCards/CardContainer"
import { CardContainerApi } from "../../apiDataDisplay/CardContainerApi"
import { Mycards } from "../../mui/MyCards"
import { Sharing } from "../../sharing/Sharing"
import { TakeNotes } from "../../take-notes/TakeNotes"
import { UseEffectHook } from "../../hooks/UseEffectHook"
import Fragment from "../../Fragment"

export const Lessons=()=>{
  let [state, setState] = useState("0")
  //let state="2"
  return <>
    <center><h1>all my lessons</h1></center>
    <div>
      <TabContext value={state} >
        <TabList onChange={(item, idx) => {
          setState(idx)
        }}>
           <Tab label="take-notes" value={"0"} />
          <Tab label="useState" value={"1"} />
          <Tab label="mui" value={"2"} />
          <Tab label="hooks" value={"3"} />
          <Tab label="Props" value={"4"} />
          <Tab label="fragment" value={"5"} />
          <Tab label="cards-dynamic" value={"6"} />
          <Tab label="api-cards-dynamic" value={"7"} />
          <Tab label="useEffect" value={"8"} />
          <Tab label="sharing" value={"9"} />

        </TabList>
        <TabPanel value="1">
          <MyUseState />
        </TabPanel>
        <TabPanel value="2">
          <StarRating />
          <Grid
            container
            direction="row"
            justifyContent="space-between"
            alignItems="center"
          >
              <Mycards />
          <Mycards />
          <Mycards />
          <Mycards />

          </Grid>
        

        </TabPanel>
        <TabPanel value="3">
          <Calculator />
        </TabPanel>
        <TabPanel value="4">
          <Parent />
        </TabPanel>
        <TabPanel value="5">
        <Fragment/>
        </TabPanel>
        <TabPanel value="6">
<CardContainer/>
<CardContainer/>
<CardContainer/>
<CardContainer/>
<CardContainer/>
<CardContainer/>


        </TabPanel>
        <TabPanel value="7">
<CardContainerApi/>
        </TabPanel>
        <TabPanel value={"8"}>
          <UseEffectHook/>
        </TabPanel>

<TabPanel value="0">
<TakeNotes/>
</TabPanel>
<TabPanel value="9">
<Sharing/>
</TabPanel>
      </TabContext>

    </div>
    </>
}