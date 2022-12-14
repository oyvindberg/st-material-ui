package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectSelectClassesMod {
  
  @JSImport("@mui/joy/Select/selectClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Select/selectClasses", JSImport.Default)
  @js.native
  val default: SelectClasses = js.native
  
  inline def getSelectUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type SelectClassKey = "root" | "button" | "indicator" | "startDecorator" | "endDecorator" | "popper" | "listbox" | "colorPrimary" | "colorNeutral" | "colorDanger" | "colorInfo" | "colorSuccess" | "colorWarning" | "colorContext" | "variantPlain" | "variantOutlined" | "variantSoft" | "variantSolid" | "sizeSm" | "sizeMd" | "sizeLg" | "focusVisible" | "disabled" | "expanded"
  
  trait SelectClasses extends StObject {
    
    /** Styles applied to the button slot. */
    var button: String
    
    /** Styles applied to the root element when color inversion is triggered. */
    var colorContext: String
    
    /** Styles applied to the root slot if `color="danger"`. */
    var colorDanger: String
    
    /** Styles applied to the root slot if `color="info"`. */
    var colorInfo: String
    
    /** Styles applied to the root slot if `color="neutral"`. */
    var colorNeutral: String
    
    /** Styles applied to the root slot if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the root slot if `color="success"`. */
    var colorSuccess: String
    
    /** Styles applied to the root slot if `color="warning"`. */
    var colorWarning: String
    
    /** State class applied to the root slot if `disabled={true}`. */
    var disabled: String
    
    /** Styles applied to the endDecorator slot. */
    var endDecorator: String
    
    /** State class applied to the root slot if listbox open. */
    var expanded: String
    
    /** State class applied to the SelectBase root slot if the button is keyboard focused. */
    var focusVisible: String
    
    /** Styles applied to the indicator slot. */
    var indicator: String
    
    /** Styles applied to the listbox slot. */
    var listbox: String
    
    /** Styles applied to the popper slot. */
    var popper: String
    
    /** Styles applied to the root slot. */
    var root: String
    
    /** Styles applied to the root slot if `size="lg"`. */
    var sizeLg: String
    
    /** Styles applied to the root slot if `size="md"`. */
    var sizeMd: String
    
    /** Styles applied to the root slot if `size="sm"`. */
    var sizeSm: String
    
    /** Styles applied to the startDecorator slot. */
    var startDecorator: String
    
    /** Styles applied to the root slot if `variant="outlined"`. */
    var variantOutlined: String
    
    /** Styles applied to the root slot if `variant="plain"`. */
    var variantPlain: String
    
    /** Styles applied to the root slot if `variant="soft"`. */
    var variantSoft: String
    
    /** Styles applied to the root slot if `variant="solid"`. */
    var variantSolid: String
  }
  object SelectClasses {
    
    inline def apply(
      button: String,
      colorContext: String,
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      disabled: String,
      endDecorator: String,
      expanded: String,
      focusVisible: String,
      indicator: String,
      listbox: String,
      popper: String,
      root: String,
      sizeLg: String,
      sizeMd: String,
      sizeSm: String,
      startDecorator: String,
      variantOutlined: String,
      variantPlain: String,
      variantSoft: String,
      variantSolid: String
    ): SelectClasses = {
      val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], colorContext = colorContext.asInstanceOf[js.Any], colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], endDecorator = endDecorator.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], listbox = listbox.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLg = sizeLg.asInstanceOf[js.Any], sizeMd = sizeMd.asInstanceOf[js.Any], sizeSm = sizeSm.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantPlain = variantPlain.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectClasses] (val x: Self) extends AnyVal {
      
      inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setColorContext(value: String): Self = StObject.set(x, "colorContext", value.asInstanceOf[js.Any])
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEndDecorator(value: String): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: String): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setIndicator(value: String): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      inline def setListbox(value: String): Self = StObject.set(x, "listbox", value.asInstanceOf[js.Any])
      
      inline def setPopper(value: String): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeLg(value: String): Self = StObject.set(x, "sizeLg", value.asInstanceOf[js.Any])
      
      inline def setSizeMd(value: String): Self = StObject.set(x, "sizeMd", value.asInstanceOf[js.Any])
      
      inline def setSizeSm(value: String): Self = StObject.set(x, "sizeSm", value.asInstanceOf[js.Any])
      
      inline def setStartDecorator(value: String): Self = StObject.set(x, "startDecorator", value.asInstanceOf[js.Any])
      
      inline def setVariantOutlined(value: String): Self = StObject.set(x, "variantOutlined", value.asInstanceOf[js.Any])
      
      inline def setVariantPlain(value: String): Self = StObject.set(x, "variantPlain", value.asInstanceOf[js.Any])
      
      inline def setVariantSoft(value: String): Self = StObject.set(x, "variantSoft", value.asInstanceOf[js.Any])
      
      inline def setVariantSolid(value: String): Self = StObject.set(x, "variantSolid", value.asInstanceOf[js.Any])
    }
  }
}
