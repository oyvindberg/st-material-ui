package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonClassesMod {
  
  @JSImport("@mui/material/Skeleton/skeletonClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Skeleton/skeletonClasses", JSImport.Default)
  @js.native
  val default: SkeletonClasses = js.native
  
  @scala.inline
  def getSkeletonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSkeletonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.text
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.rectangular
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.circular
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.pulse
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.wave
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.withChildren
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.fitContent
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.heightAuto
  */
  trait SkeletonClassKey extends StObject
  
  @js.native
  trait SkeletonClasses extends StObject {
    
    /** Styles applied to the root element if `variant="circular"`. */
    var circular: String = js.native
    
    /** Styles applied when the component is passed children and no width. */
    var fitContent: String = js.native
    
    /** Styles applied when the component is passed children and no height. */
    var heightAuto: String = js.native
    
    /** Styles applied to the root element if `animation="pulse"`. */
    var pulse: String = js.native
    
    /** Styles applied to the root element if `variant="rectangular"`. */
    var rectangular: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `variant="text"`. */
    var text: String = js.native
    
    /** Styles applied to the root element if `animation="wave"`. */
    var wave: String = js.native
    
    /** Styles applied when the component is passed children. */
    var withChildren: String = js.native
  }
  object SkeletonClasses {
    
    @scala.inline
    def apply(
      circular: String,
      fitContent: String,
      heightAuto: String,
      pulse: String,
      rectangular: String,
      root: String,
      text: String,
      wave: String,
      withChildren: String
    ): SkeletonClasses = {
      val __obj = js.Dynamic.literal(circular = circular.asInstanceOf[js.Any], fitContent = fitContent.asInstanceOf[js.Any], heightAuto = heightAuto.asInstanceOf[js.Any], pulse = pulse.asInstanceOf[js.Any], rectangular = rectangular.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], wave = wave.asInstanceOf[js.Any], withChildren = withChildren.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonClasses]
    }
    
    @scala.inline
    implicit class SkeletonClassesMutableBuilder[Self <: SkeletonClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircular(value: String): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitContent(value: String): Self = StObject.set(x, "fitContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightAuto(value: String): Self = StObject.set(x, "heightAuto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPulse(value: String): Self = StObject.set(x, "pulse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRectangular(value: String): Self = StObject.set(x, "rectangular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWave(value: String): Self = StObject.set(x, "wave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithChildren(value: String): Self = StObject.set(x, "withChildren", value.asInstanceOf[js.Any])
    }
  }
}
