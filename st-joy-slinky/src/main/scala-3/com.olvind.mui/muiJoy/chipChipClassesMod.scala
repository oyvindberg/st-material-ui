package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipChipClassesMod {
  
  @JSImport("@mui/joy/Chip/chipClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Chip/chipClasses", JSImport.Default)
  @js.native
  val default: ChipClasses = js.native
  
  inline def getChipUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getChipUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ChipClassKey = "root" | "colorPrimary" | "colorNeutral" | "colorDanger" | "colorInfo" | "colorSuccess" | "colorWarning" | "disabled" | "endDecorator" | "focusVisible" | "label" | "labelSm" | "labelMd" | "labelLg" | "sizeSm" | "sizeMd" | "sizeLg" | "startDecorator" | "variantPlain" | "variantSolid" | "variantSoft" | "variantOutlined"
  
  trait ChipClasses extends StObject {
    
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
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** Styles applied to the endDecorator element if supplied. */
    var endDecorator: String
    
    /** State class applied to the root element if keyboard focused. */
    var focusVisible: String
    
    /** Styles applied to the label `span` element. */
    var label: String
    
    /** Styles applied to the label `span` element if `size="lg"`. */
    var labelLg: String
    
    /** Styles applied to the label `span` element if `size="md"`. */
    var labelMd: String
    
    /** Styles applied to the label `span` element if `size="sm"`. */
    var labelSm: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `size="lg"`. */
    var sizeLg: String
    
    /** Styles applied to the root element if `size="md"`. */
    var sizeMd: String
    
    /** Styles applied to the root element if `size="sm"`. */
    var sizeSm: String
    
    /** Styles applied to the startDecorator element if supplied. */
    var startDecorator: String
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var variantOutlined: String
    
    /** Styles applied to the root element if `variant="plain"`. */
    var variantPlain: String
    
    /** Styles applied to the root element if `variant="soft"`. */
    var variantSoft: String
    
    /** Styles applied to the root element if `variant="solid"`. */
    var variantSolid: String
  }
  object ChipClasses {
    
    inline def apply(
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      disabled: String,
      endDecorator: String,
      focusVisible: String,
      label: String,
      labelLg: String,
      labelMd: String,
      labelSm: String,
      root: String,
      sizeLg: String,
      sizeMd: String,
      sizeSm: String,
      startDecorator: String,
      variantOutlined: String,
      variantPlain: String,
      variantSoft: String,
      variantSolid: String
    ): ChipClasses = {
      val __obj = js.Dynamic.literal(colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], endDecorator = endDecorator.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelLg = labelLg.asInstanceOf[js.Any], labelMd = labelMd.asInstanceOf[js.Any], labelSm = labelSm.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLg = sizeLg.asInstanceOf[js.Any], sizeMd = sizeMd.asInstanceOf[js.Any], sizeSm = sizeSm.asInstanceOf[js.Any], startDecorator = startDecorator.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantPlain = variantPlain.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChipClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChipClasses] (val x: Self) extends AnyVal {
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEndDecorator(value: String): Self = StObject.set(x, "endDecorator", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelLg(value: String): Self = StObject.set(x, "labelLg", value.asInstanceOf[js.Any])
      
      inline def setLabelMd(value: String): Self = StObject.set(x, "labelMd", value.asInstanceOf[js.Any])
      
      inline def setLabelSm(value: String): Self = StObject.set(x, "labelSm", value.asInstanceOf[js.Any])
      
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
