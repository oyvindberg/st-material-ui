package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressClassesMod {
  
  @JSImport("@mui/material/CircularProgress/circularProgressClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/CircularProgress/circularProgressClasses", JSImport.Default)
  @js.native
  val default: CircularProgressClasses = js.native
  
  inline def getCircularProgressUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCircularProgressUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.determinate
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.indeterminate
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.svg
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.circle
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.circleDeterminate
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.circleIndeterminate
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.circleDisableShrink
  */
  trait CircularProgressClassKey extends StObject
  
  trait CircularProgressClasses extends StObject {
    
    /** Styles applied to the `circle` svg path. */
    var circle: String
    
    /** Styles applied to the `circle` svg path if `variant="determinate"`. */
    var circleDeterminate: String
    
    /** Styles applied to the `circle` svg path if `disableShrink={true}`. */
    var circleDisableShrink: String
    
    /** Styles applied to the `circle` svg path if `variant="indeterminate"`. */
    var circleIndeterminate: String
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the root element if `color="secondary"`. */
    var colorSecondary: String
    
    /** Styles applied to the root element if `variant="determinate"`. */
    var determinate: String
    
    /** Styles applied to the root element if `variant="indeterminate"`. */
    var indeterminate: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the svg element. */
    var svg: String
  }
  object CircularProgressClasses {
    
    inline def apply(
      circle: String,
      circleDeterminate: String,
      circleDisableShrink: String,
      circleIndeterminate: String,
      colorPrimary: String,
      colorSecondary: String,
      determinate: String,
      indeterminate: String,
      root: String,
      svg: String
    ): CircularProgressClasses = {
      val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], circleDeterminate = circleDeterminate.asInstanceOf[js.Any], circleDisableShrink = circleDisableShrink.asInstanceOf[js.Any], circleIndeterminate = circleIndeterminate.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], determinate = determinate.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircularProgressClasses]
    }
    
    extension [Self <: CircularProgressClasses](x: Self) {
      
      inline def setCircle(value: String): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleDeterminate(value: String): Self = StObject.set(x, "circleDeterminate", value.asInstanceOf[js.Any])
      
      inline def setCircleDisableShrink(value: String): Self = StObject.set(x, "circleDisableShrink", value.asInstanceOf[js.Any])
      
      inline def setCircleIndeterminate(value: String): Self = StObject.set(x, "circleIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      inline def setDeterminate(value: String): Self = StObject.set(x, "determinate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminate(value: String): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    }
  }
}
