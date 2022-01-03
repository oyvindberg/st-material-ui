package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressClassesMod {
  
  @JSImport("@mui/material/CircularProgress/circularProgressClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/CircularProgress/circularProgressClasses", JSImport.Default)
  @js.native
  val default: CircularProgressClasses = js.native
  
  @scala.inline
  def getCircularProgressUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCircularProgressUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  
  @js.native
  trait CircularProgressClasses extends StObject {
    
    /** Styles applied to the `circle` svg path. */
    var circle: String = js.native
    
    /** Styles applied to the `circle` svg path if `variant="determinate"`. */
    var circleDeterminate: String = js.native
    
    /** Styles applied to the `circle` svg path if `disableShrink={true}`. */
    var circleDisableShrink: String = js.native
    
    /** Styles applied to the `circle` svg path if `variant="indeterminate"`. */
    var circleIndeterminate: String = js.native
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String = js.native
    
    /** Styles applied to the root element if `color="secondary"`. */
    var colorSecondary: String = js.native
    
    /** Styles applied to the root element if `variant="determinate"`. */
    var determinate: String = js.native
    
    /** Styles applied to the root element if `variant="indeterminate"`. */
    var indeterminate: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the svg element. */
    var svg: String = js.native
  }
  object CircularProgressClasses {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CircularProgressClassesMutableBuilder[Self <: CircularProgressClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircle(value: String): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleDeterminate(value: String): Self = StObject.set(x, "circleDeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleDisableShrink(value: String): Self = StObject.set(x, "circleDisableShrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleIndeterminate(value: String): Self = StObject.set(x, "circleIndeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeterminate(value: String): Self = StObject.set(x, "determinate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndeterminate(value: String): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    }
  }
}
