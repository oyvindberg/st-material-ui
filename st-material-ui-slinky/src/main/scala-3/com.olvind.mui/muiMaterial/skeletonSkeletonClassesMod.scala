package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonSkeletonClassesMod {
  
  @JSImport("@mui/material/Skeleton/skeletonClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Skeleton/skeletonClasses", JSImport.Default)
  @js.native
  val default: SkeletonClasses = js.native
  
  inline def getSkeletonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSkeletonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type SkeletonClassKey = "root" | "text" | "rectangular" | "rounded" | "circular" | "pulse" | "wave" | "withChildren" | "fitContent" | "heightAuto"
  
  trait SkeletonClasses extends StObject {
    
    /** Styles applied to the root element if `variant="circular"`. */
    var circular: String
    
    /** Styles applied when the component is passed children and no width. */
    var fitContent: String
    
    /** Styles applied when the component is passed children and no height. */
    var heightAuto: String
    
    /** Styles applied to the root element if `animation="pulse"`. */
    var pulse: String
    
    /** Styles applied to the root element if `variant="rectangular"`. */
    var rectangular: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `variant="rounded"`. */
    var rounded: String
    
    /** Styles applied to the root element if `variant="text"`. */
    var text: String
    
    /** Styles applied to the root element if `animation="wave"`. */
    var wave: String
    
    /** Styles applied when the component is passed children. */
    var withChildren: String
  }
  object SkeletonClasses {
    
    inline def apply(
      circular: String,
      fitContent: String,
      heightAuto: String,
      pulse: String,
      rectangular: String,
      root: String,
      rounded: String,
      text: String,
      wave: String,
      withChildren: String
    ): SkeletonClasses = {
      val __obj = js.Dynamic.literal(circular = circular.asInstanceOf[js.Any], fitContent = fitContent.asInstanceOf[js.Any], heightAuto = heightAuto.asInstanceOf[js.Any], pulse = pulse.asInstanceOf[js.Any], rectangular = rectangular.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], rounded = rounded.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], wave = wave.asInstanceOf[js.Any], withChildren = withChildren.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkeletonClasses] (val x: Self) extends AnyVal {
      
      inline def setCircular(value: String): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setFitContent(value: String): Self = StObject.set(x, "fitContent", value.asInstanceOf[js.Any])
      
      inline def setHeightAuto(value: String): Self = StObject.set(x, "heightAuto", value.asInstanceOf[js.Any])
      
      inline def setPulse(value: String): Self = StObject.set(x, "pulse", value.asInstanceOf[js.Any])
      
      inline def setRectangular(value: String): Self = StObject.set(x, "rectangular", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setWave(value: String): Self = StObject.set(x, "wave", value.asInstanceOf[js.Any])
      
      inline def setWithChildren(value: String): Self = StObject.set(x, "withChildren", value.asInstanceOf[js.Any])
    }
  }
}
