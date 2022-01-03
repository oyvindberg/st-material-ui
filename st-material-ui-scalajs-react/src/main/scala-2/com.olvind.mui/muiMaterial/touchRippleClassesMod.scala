package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchRippleClassesMod {
  
  @JSImport("@mui/material/ButtonBase/touchRippleClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ButtonBase/touchRippleClasses", JSImport.Default)
  @js.native
  val default: TouchRippleClasses = js.native
  
  @scala.inline
  def getTouchRippleUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTouchRippleUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.ripple
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.rippleVisible
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.ripplePulsate
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.child
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.childLeaving
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.childPulsate
  */
  trait TouchRippleClassKey extends StObject
  
  @js.native
  trait TouchRippleClasses extends StObject {
    
    /** Styles applied to the internal `Ripple` components `child` class. */
    var child: String = js.native
    
    /** Styles applied to the internal `Ripple` components `childLeaving` class. */
    var childLeaving: String = js.native
    
    /** Styles applied to the internal `Ripple` components `childPulsate` class. */
    var childPulsate: String = js.native
    
    /** Styles applied to the internal `Ripple` components `ripple` class. */
    var ripple: String = js.native
    
    /** Styles applied to the internal `Ripple` components `ripplePulsate` class. */
    var ripplePulsate: String = js.native
    
    /** Styles applied to the internal `Ripple` components `rippleVisible` class. */
    var rippleVisible: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object TouchRippleClasses {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class TouchRippleClassesMutableBuilder[Self <: TouchRippleClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChild(value: String): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildLeaving(value: String): Self = StObject.set(x, "childLeaving", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildPulsate(value: String): Self = StObject.set(x, "childPulsate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRipple(value: String): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRipplePulsate(value: String): Self = StObject.set(x, "ripplePulsate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleVisible(value: String): Self = StObject.set(x, "rippleVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
