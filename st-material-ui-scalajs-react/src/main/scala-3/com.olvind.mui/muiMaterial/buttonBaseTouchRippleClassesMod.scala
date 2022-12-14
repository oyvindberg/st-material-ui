package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonBaseTouchRippleClassesMod {
  
  @JSImport("@mui/material/ButtonBase/touchRippleClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ButtonBase/touchRippleClasses", JSImport.Default)
  @js.native
  val default: TouchRippleClasses = js.native
  
  inline def getTouchRippleUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTouchRippleUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TouchRippleClassKey = "root" | "ripple" | "rippleVisible" | "ripplePulsate" | "child" | "childLeaving" | "childPulsate"
  
  trait TouchRippleClasses extends StObject {
    
    /** Styles applied to the internal `Ripple` components `child` class. */
    var child: String
    
    /** Styles applied to the internal `Ripple` components `childLeaving` class. */
    var childLeaving: String
    
    /** Styles applied to the internal `Ripple` components `childPulsate` class. */
    var childPulsate: String
    
    /** Styles applied to the internal `Ripple` components `ripple` class. */
    var ripple: String
    
    /** Styles applied to the internal `Ripple` components `ripplePulsate` class. */
    var ripplePulsate: String
    
    /** Styles applied to the internal `Ripple` components `rippleVisible` class. */
    var rippleVisible: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object TouchRippleClasses {
    
    inline def apply(
      child: String,
      childLeaving: String,
      childPulsate: String,
      ripple: String,
      ripplePulsate: String,
      rippleVisible: String,
      root: String
    ): TouchRippleClasses = {
      val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], childLeaving = childLeaving.asInstanceOf[js.Any], childPulsate = childPulsate.asInstanceOf[js.Any], ripple = ripple.asInstanceOf[js.Any], ripplePulsate = ripplePulsate.asInstanceOf[js.Any], rippleVisible = rippleVisible.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[TouchRippleClasses]
    }
    
    extension [Self <: TouchRippleClasses](x: Self) {
      
      inline def setChild(value: String): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildLeaving(value: String): Self = StObject.set(x, "childLeaving", value.asInstanceOf[js.Any])
      
      inline def setChildPulsate(value: String): Self = StObject.set(x, "childPulsate", value.asInstanceOf[js.Any])
      
      inline def setRipple(value: String): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setRipplePulsate(value: String): Self = StObject.set(x, "ripplePulsate", value.asInstanceOf[js.Any])
      
      inline def setRippleVisible(value: String): Self = StObject.set(x, "rippleVisible", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
