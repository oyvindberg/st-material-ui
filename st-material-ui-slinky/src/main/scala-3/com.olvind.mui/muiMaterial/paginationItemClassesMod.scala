package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationItemClassesMod {
  
  @JSImport("@mui/material/PaginationItem/paginationItemClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/PaginationItem/paginationItemClasses", JSImport.Default)
  @js.native
  val default: PaginationItemClasses = js.native
  
  inline def getPaginationItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.page
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeLarge
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.text
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.textPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.textSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlined
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlinedPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.outlinedSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.rounded
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.ellipsis
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.firstLast
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.previousNext
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.focusVisible
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.selected
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.icon
  */
  trait PaginationItemClassKey extends StObject
  
  trait PaginationItemClasses extends StObject {
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** Styles applied to the root element if `type="start-ellipsis"` or `type="end-ellipsis"`. */
    var ellipsis: String
    
    /** Styles applyed to the root element if `type="first"` or type="last". */
    var firstLast: String
    
    /** State class applied to the root element if keyboard focused. */
    var focusVisible: String
    
    /** Styles applied to the icon to display. */
    var icon: String
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var outlined: String
    
    /** Styles applied to the root element if `variant="outlined"` and `color="primary"`. */
    var outlinedPrimary: String
    
    /** Styles applied to the root element if `variant="outlined"` and `color="secondary"`. */
    var outlinedSecondary: String
    
    /** Styles applied to the root element if `type="page"`. */
    var page: String
    
    /** Styles applyed to the root element if `type="previous"` or type="next". */
    var previousNext: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `rounded="true"`. */
    var rounded: String
    
    /** State class applied to the root element if `selected={true}`. */
    var selected: String
    
    /** Styles applied to the root element if `size="large"`. */
    var sizeLarge: String
    
    /** Styles applied to the root element if `size="small"`. */
    var sizeSmall: String
    
    /** Styles applied to the root element if `variant="text"`. */
    var text: String
    
    /** Styles applied to the root element if `variant="text"` and `color="primary"`. */
    var textPrimary: String
    
    /** Styles applied to the root element if `variant="text"` and `color="secondary"`. */
    var textSecondary: String
  }
  object PaginationItemClasses {
    
    inline def apply(
      disabled: String,
      ellipsis: String,
      firstLast: String,
      focusVisible: String,
      icon: String,
      outlined: String,
      outlinedPrimary: String,
      outlinedSecondary: String,
      page: String,
      previousNext: String,
      root: String,
      rounded: String,
      selected: String,
      sizeLarge: String,
      sizeSmall: String,
      text: String,
      textPrimary: String,
      textSecondary: String
    ): PaginationItemClasses = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], ellipsis = ellipsis.asInstanceOf[js.Any], firstLast = firstLast.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], outlined = outlined.asInstanceOf[js.Any], outlinedPrimary = outlinedPrimary.asInstanceOf[js.Any], outlinedSecondary = outlinedSecondary.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], previousNext = previousNext.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], rounded = rounded.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], sizeLarge = sizeLarge.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textPrimary = textPrimary.asInstanceOf[js.Any], textSecondary = textSecondary.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationItemClasses]
    }
    
    extension [Self <: PaginationItemClasses](x: Self) {
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEllipsis(value: String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setFirstLast(value: String): Self = StObject.set(x, "firstLast", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setOutlined(value: String): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      inline def setOutlinedPrimary(value: String): Self = StObject.set(x, "outlinedPrimary", value.asInstanceOf[js.Any])
      
      inline def setOutlinedSecondary(value: String): Self = StObject.set(x, "outlinedSecondary", value.asInstanceOf[js.Any])
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPreviousNext(value: String): Self = StObject.set(x, "previousNext", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSizeLarge(value: String): Self = StObject.set(x, "sizeLarge", value.asInstanceOf[js.Any])
      
      inline def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextPrimary(value: String): Self = StObject.set(x, "textPrimary", value.asInstanceOf[js.Any])
      
      inline def setTextSecondary(value: String): Self = StObject.set(x, "textSecondary", value.asInstanceOf[js.Any])
    }
  }
}
