package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapseClassesMod {
  
  @JSImport("@mui/material/Collapse/collapseClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Collapse/collapseClasses", JSImport.Default)
  @js.native
  val default: CollapseClasses = js.native
  
  inline def getCollapseUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCollapseUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.horizontal
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.entered
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.hidden
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.wrapper
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.wrapperInner
  */
  trait CollapseClassKey extends StObject
  
  trait CollapseClasses extends StObject {
    
    /** Styles applied to the root element when the transition has entered. */
    var entered: String
    
    /** Styles applied to the root element when the transition has exited and `collapsedSize` = 0px. */
    var hidden: String
    
    /** State class applied to the root element if `orientation="horizontal"`. */
    var horizontal: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the outer wrapper element. */
    var wrapper: String
    
    /** Styles applied to the inner wrapper element. */
    var wrapperInner: String
  }
  object CollapseClasses {
    
    inline def apply(
      entered: String,
      hidden: String,
      horizontal: String,
      root: String,
      wrapper: String,
      wrapperInner: String
    ): CollapseClasses = {
      val __obj = js.Dynamic.literal(entered = entered.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any], wrapperInner = wrapperInner.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapseClasses]
    }
    
    extension [Self <: CollapseClasses](x: Self) {
      
      inline def setEntered(value: String): Self = StObject.set(x, "entered", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperInner(value: String): Self = StObject.set(x, "wrapperInner", value.asInstanceOf[js.Any])
    }
  }
}
