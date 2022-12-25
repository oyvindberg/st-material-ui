package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemButtonListItemButtonClassesMod {
  
  @JSImport("@mui/joy/ListItemButton/listItemButtonClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/ListItemButton/listItemButtonClasses", JSImport.Default)
  @js.native
  val default: ListItemButtonClasses = js.native
  
  inline def getListItemButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ListItemButtonClassKey = "root" | "vertical" | "horizontal" | "colorPrimary" | "colorNeutral" | "colorDanger" | "colorInfo" | "colorSuccess" | "colorWarning" | "colorContext" | "focusVisible" | "disabled" | "selected" | "variantPlain" | "variantSoft" | "variantOutlined" | "variantSolid"
  
  trait ListItemButtonClasses extends StObject {
    
    /** Styles applied to the root element if `color="context"`. */
    var colorContext: String
    
    /** Styles applied to the root element if `color="danger"`. */
    var colorDanger: String
    
    /** Styles applied to the root element if `color="info"`. */
    var colorInfo: String
    
    /** Styles applied to the root element if `color="neutral"`. */
    var colorNeutral: String
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the root element if `color="success"`. */
    var colorSuccess: String
    
    /** Styles applied to the root element if `color="warning"`. */
    var colorWarning: String
    
    /** State class applied to the inner `component` element if `disabled={true}`. */
    var disabled: String
    
    /** State class applied to the `component`'s `focusVisibleClassName` prop. */
    var focusVisible: String
    
    /** Styles applied to the root element, if `orientation="horizontal"`. */
    var horizontal: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** State class applied to the root element if `selected={true}`. */
    var selected: String
    
    /** State class applied to the root element if `variant="outlined"`. */
    var variantOutlined: String
    
    /** State class applied to the root element if `variant="plain"`. */
    var variantPlain: String
    
    /** State class applied to the root element if `variant="soft"`. */
    var variantSoft: String
    
    /** State class applied to the root element if `variant="solid"`. */
    var variantSolid: String
    
    /** Styles applied to the root element, if `orientation="vertical"`. */
    var vertical: String
  }
  object ListItemButtonClasses {
    
    inline def apply(
      colorContext: String,
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      disabled: String,
      focusVisible: String,
      horizontal: String,
      root: String,
      selected: String,
      variantOutlined: String,
      variantPlain: String,
      variantSoft: String,
      variantSolid: String,
      vertical: String
    ): ListItemButtonClasses = {
      val __obj = js.Dynamic.literal(colorContext = colorContext.asInstanceOf[js.Any], colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantPlain = variantPlain.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemButtonClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemButtonClasses] (val x: Self) extends AnyVal {
      
      inline def setColorContext(value: String): Self = StObject.set(x, "colorContext", value.asInstanceOf[js.Any])
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setVariantOutlined(value: String): Self = StObject.set(x, "variantOutlined", value.asInstanceOf[js.Any])
      
      inline def setVariantPlain(value: String): Self = StObject.set(x, "variantPlain", value.asInstanceOf[js.Any])
      
      inline def setVariantSoft(value: String): Self = StObject.set(x, "variantSoft", value.asInstanceOf[js.Any])
      
      inline def setVariantSolid(value: String): Self = StObject.set(x, "variantSolid", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
