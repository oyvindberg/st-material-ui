package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerClassesMod {
  
  @JSImport("@mui/material/Divider/dividerClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Divider/dividerClasses", JSImport.Default)
  @js.native
  val default: DividerClasses = js.native
  
  @scala.inline
  def getDividerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDividerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.absolute
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.inset
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.fullWidth
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.light
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.middle
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.vertical
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.flexItem
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.withChildren
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.withChildrenVertical
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.textAlignRight
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.textAlignLeft
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.wrapper
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.wrapperVertical
  */
  trait DividerClassKey extends StObject
  
  @js.native
  trait DividerClasses extends StObject {
    
    /** Styles applied to the root element if `absolute={true}`. */
    var absolute: String = js.native
    
    /** Styles applied to the root element if `flexItem={true}`. */
    var flexItem: String = js.native
    
    /** Styles applied to the root element if `variant="fullWidth"`. */
    var fullWidth: String = js.native
    
    /** Styles applied to the root element if `variant="inset"`. */
    var inset: String = js.native
    
    /** Styles applied to the root element if `light={true}`. */
    var light: String = js.native
    
    /** Styles applied to the root element if `variant="middle"`. */
    var middle: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `textAlign="left" orientation="horizontal"`. */
    var textAlignLeft: String = js.native
    
    /** Styles applied to the root element if `textAlign="right" orientation="horizontal"`. */
    var textAlignRight: String = js.native
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var vertical: String = js.native
    
    /** Styles applied to the root element if divider have text. */
    var withChildren: String = js.native
    
    /** Styles applied to the root element if divider have text and `orientation="vertical"`. */
    var withChildrenVertical: String = js.native
    
    /** Styles applied to the span children element if `orientation="horizontal"`. */
    var wrapper: String = js.native
    
    /** Styles applied to the span children element if `orientation="vertical"`. */
    var wrapperVertical: String = js.native
  }
  object DividerClasses {
    
    @scala.inline
    def apply(
      absolute: String,
      flexItem: String,
      fullWidth: String,
      inset: String,
      light: String,
      middle: String,
      root: String,
      textAlignLeft: String,
      textAlignRight: String,
      vertical: String,
      withChildren: String,
      withChildrenVertical: String,
      wrapper: String,
      wrapperVertical: String
    ): DividerClasses = {
      val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], flexItem = flexItem.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], inset = inset.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], textAlignLeft = textAlignLeft.asInstanceOf[js.Any], textAlignRight = textAlignRight.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], withChildren = withChildren.asInstanceOf[js.Any], withChildrenVertical = withChildrenVertical.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any], wrapperVertical = wrapperVertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[DividerClasses]
    }
    
    @scala.inline
    implicit class DividerClassesMutableBuilder[Self <: DividerClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolute(value: String): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexItem(value: String): Self = StObject.set(x, "flexItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidth(value: String): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInset(value: String): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddle(value: String): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignLeft(value: String): Self = StObject.set(x, "textAlignLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignRight(value: String): Self = StObject.set(x, "textAlignRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithChildren(value: String): Self = StObject.set(x, "withChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithChildrenVertical(value: String): Self = StObject.set(x, "withChildrenVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperVertical(value: String): Self = StObject.set(x, "wrapperVertical", value.asInstanceOf[js.Any])
    }
  }
}
