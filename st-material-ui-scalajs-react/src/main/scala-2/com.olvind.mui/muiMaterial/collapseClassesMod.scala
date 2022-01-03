package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapseClassesMod {
  
  @JSImport("@mui/material/Collapse/collapseClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Collapse/collapseClasses", JSImport.Default)
  @js.native
  val default: CollapseClasses = js.native
  
  @scala.inline
  def getCollapseUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCollapseUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.horizontal
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.entered
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.hidden
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.wrapper
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.wrapperInner
  */
  trait CollapseClassKey extends StObject
  
  @js.native
  trait CollapseClasses extends StObject {
    
    /** Styles applied to the root element when the transition has entered. */
    var entered: String = js.native
    
    /** Styles applied to the root element when the transition has exited and `collapsedSize` = 0px. */
    var hidden: String = js.native
    
    /** State class applied to the root element if `orientation="horizontal"`. */
    var horizontal: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the outer wrapper element. */
    var wrapper: String = js.native
    
    /** Styles applied to the inner wrapper element. */
    var wrapperInner: String = js.native
  }
  object CollapseClasses {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CollapseClassesMutableBuilder[Self <: CollapseClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntered(value: String): Self = StObject.set(x, "entered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperInner(value: String): Self = StObject.set(x, "wrapperInner", value.asInstanceOf[js.Any])
    }
  }
}
