package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speedDialActionClassesMod {
  
  @JSImport("@mui/material/SpeedDialAction/speedDialActionClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/SpeedDialAction/speedDialActionClasses", JSImport.Default)
  @js.native
  val default: SpeedDialActionClasses = js.native
  
  inline def getSpeedDialActionUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpeedDialActionUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.fab
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.fabClosed
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.staticTooltip
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.staticTooltipClosed
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.staticTooltipLabel
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.tooltipPlacementLeft
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.tooltipPlacementRight
  */
  trait SpeedDialActionClassKey extends StObject
  
  trait SpeedDialActionClasses extends StObject {
    
    /** Styles applied to the Fab component. */
    var fab: String
    
    /** Styles applied to the Fab component if `open={false}`. */
    var fabClosed: String
    
    /** Styles applied to the root element if `tooltipOpen={true}`. */
    var staticTooltip: String
    
    /** Styles applied to the root element if `tooltipOpen={true}` and `open={false}`. */
    var staticTooltipClosed: String
    
    /** Styles applied to the static tooltip label if `tooltipOpen={true}`. */
    var staticTooltipLabel: String
    
    /** Styles applied to the root element if `tooltipOpen={true}` and `tooltipPlacement="left"`` */
    var tooltipPlacementLeft: String
    
    /** Styles applied to the root element if `tooltipOpen={true}` and `tooltipPlacement="right"`` */
    var tooltipPlacementRight: String
  }
  object SpeedDialActionClasses {
    
    inline def apply(
      fab: String,
      fabClosed: String,
      staticTooltip: String,
      staticTooltipClosed: String,
      staticTooltipLabel: String,
      tooltipPlacementLeft: String,
      tooltipPlacementRight: String
    ): SpeedDialActionClasses = {
      val __obj = js.Dynamic.literal(fab = fab.asInstanceOf[js.Any], fabClosed = fabClosed.asInstanceOf[js.Any], staticTooltip = staticTooltip.asInstanceOf[js.Any], staticTooltipClosed = staticTooltipClosed.asInstanceOf[js.Any], staticTooltipLabel = staticTooltipLabel.asInstanceOf[js.Any], tooltipPlacementLeft = tooltipPlacementLeft.asInstanceOf[js.Any], tooltipPlacementRight = tooltipPlacementRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpeedDialActionClasses]
    }
    
    extension [Self <: SpeedDialActionClasses](x: Self) {
      
      inline def setFab(value: String): Self = StObject.set(x, "fab", value.asInstanceOf[js.Any])
      
      inline def setFabClosed(value: String): Self = StObject.set(x, "fabClosed", value.asInstanceOf[js.Any])
      
      inline def setStaticTooltip(value: String): Self = StObject.set(x, "staticTooltip", value.asInstanceOf[js.Any])
      
      inline def setStaticTooltipClosed(value: String): Self = StObject.set(x, "staticTooltipClosed", value.asInstanceOf[js.Any])
      
      inline def setStaticTooltipLabel(value: String): Self = StObject.set(x, "staticTooltipLabel", value.asInstanceOf[js.Any])
      
      inline def setTooltipPlacementLeft(value: String): Self = StObject.set(x, "tooltipPlacementLeft", value.asInstanceOf[js.Any])
      
      inline def setTooltipPlacementRight(value: String): Self = StObject.set(x, "tooltipPlacementRight", value.asInstanceOf[js.Any])
    }
  }
}
