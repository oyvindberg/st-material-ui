package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonClassesMod {
  
  @JSImport("@mui/material/IconButton/iconButtonClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/IconButton/iconButtonClasses", JSImport.Default)
  @js.native
  val default: IconButtonClasses = js.native
  
  @scala.inline
  def getIconButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.edgeStart
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.edgeEnd
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorInherit
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeMedium
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeLarge
  */
  trait IconButtonClassKey extends StObject
  
  @js.native
  trait IconButtonClasses extends StObject {
    
    /** Styles applied to the root element if `color="inherit"`. */
    var colorInherit: String = js.native
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String = js.native
    
    /** Styles applied to the root element if `color="secondary"`. */
    var colorSecondary: String = js.native
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String = js.native
    
    /** Styles applied to the root element if `edge="end"`. */
    var edgeEnd: String = js.native
    
    /** Styles applied to the root element if `edge="start"`. */
    var edgeStart: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `size="large"`. */
    var sizeLarge: String = js.native
    
    /** Styles applied to the root element if `size="medium"`. */
    var sizeMedium: String = js.native
    
    /** Styles applied to the root element if `size="small"`. */
    var sizeSmall: String = js.native
  }
  object IconButtonClasses {
    
    @scala.inline
    def apply(
      colorInherit: String,
      colorPrimary: String,
      colorSecondary: String,
      disabled: String,
      edgeEnd: String,
      edgeStart: String,
      root: String,
      sizeLarge: String,
      sizeMedium: String,
      sizeSmall: String
    ): IconButtonClasses = {
      val __obj = js.Dynamic.literal(colorInherit = colorInherit.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], edgeEnd = edgeEnd.asInstanceOf[js.Any], edgeStart = edgeStart.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLarge = sizeLarge.asInstanceOf[js.Any], sizeMedium = sizeMedium.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconButtonClasses]
    }
    
    @scala.inline
    implicit class IconButtonClassesMutableBuilder[Self <: IconButtonClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorInherit(value: String): Self = StObject.set(x, "colorInherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeEnd(value: String): Self = StObject.set(x, "edgeEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeStart(value: String): Self = StObject.set(x, "edgeStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeLarge(value: String): Self = StObject.set(x, "sizeLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeMedium(value: String): Self = StObject.set(x, "sizeMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
    }
  }
}
