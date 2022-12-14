package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableClassesMod {
  
  @JSImport("@mui/joy/Table/tableClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Table/tableClasses", JSImport.Default)
  @js.native
  val default: TableClasses = js.native
  
  inline def getTableUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TableClassKey = "root" | "colorPrimary" | "colorNeutral" | "colorDanger" | "colorInfo" | "colorSuccess" | "colorWarning" | "colorContext" | "variantPlain" | "variantOutlined" | "variantSoft" | "variantSolid" | "sizeSm" | "sizeMd" | "sizeLg" | "stickyHeader" | "noWrap" | "hoverRow" | "borderAxisNone" | "borderAxisX" | "borderAxisXBetween" | "borderAxisY" | "borderAxisYBetween" | "borderAxisBoth" | "borderAxisBothBetween"
  
  trait TableClasses extends StObject {
    
    /** Styles applied to the root element if `borderAxis="both"`. */
    var borderAxisBoth: String
    
    /** Styles applied to the root element if `borderAxis="bothBetween"`. */
    var borderAxisBothBetween: String
    
    /** Styles applied to the root element if `borderAxis="none"`. */
    var borderAxisNone: String
    
    /** Styles applied to the root element if `borderAxis="x"`. */
    var borderAxisX: String
    
    /** Styles applied to the root element if `borderAxis="xBetween"`. */
    var borderAxisXBetween: String
    
    /** Styles applied to the root element if `borderAxis="y"`. */
    var borderAxisY: String
    
    /** Styles applied to the root element if `borderAxis="yBetween"`. */
    var borderAxisYBetween: String
    
    /** Styles applied to the root element when color inversion is triggered. */
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
    
    /** Styles applied to the root element if `hoverRow` is true. */
    var hoverRow: String
    
    /** Styles applied to the root element if `noWrap` is true. */
    var noWrap: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `size="lg"`. */
    var sizeLg: String
    
    /** Styles applied to the root element if `size="md"`. */
    var sizeMd: String
    
    /** Styles applied to the root element if `size="sm"`. */
    var sizeSm: String
    
    /** Styles applied to the root element if `stickyHeader` is true. */
    var stickyHeader: String
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var variantOutlined: String
    
    /** Styles applied to the root element if `variant="plain"`. */
    var variantPlain: String
    
    /** Styles applied to the root element if `variant="soft"`. */
    var variantSoft: String
    
    /** Styles applied to the root element if `variant="solid"`. */
    var variantSolid: String
  }
  object TableClasses {
    
    inline def apply(
      borderAxisBoth: String,
      borderAxisBothBetween: String,
      borderAxisNone: String,
      borderAxisX: String,
      borderAxisXBetween: String,
      borderAxisY: String,
      borderAxisYBetween: String,
      colorContext: String,
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      hoverRow: String,
      noWrap: String,
      root: String,
      sizeLg: String,
      sizeMd: String,
      sizeSm: String,
      stickyHeader: String,
      variantOutlined: String,
      variantPlain: String,
      variantSoft: String,
      variantSolid: String
    ): TableClasses = {
      val __obj = js.Dynamic.literal(borderAxisBoth = borderAxisBoth.asInstanceOf[js.Any], borderAxisBothBetween = borderAxisBothBetween.asInstanceOf[js.Any], borderAxisNone = borderAxisNone.asInstanceOf[js.Any], borderAxisX = borderAxisX.asInstanceOf[js.Any], borderAxisXBetween = borderAxisXBetween.asInstanceOf[js.Any], borderAxisY = borderAxisY.asInstanceOf[js.Any], borderAxisYBetween = borderAxisYBetween.asInstanceOf[js.Any], colorContext = colorContext.asInstanceOf[js.Any], colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], hoverRow = hoverRow.asInstanceOf[js.Any], noWrap = noWrap.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLg = sizeLg.asInstanceOf[js.Any], sizeMd = sizeMd.asInstanceOf[js.Any], sizeSm = sizeSm.asInstanceOf[js.Any], stickyHeader = stickyHeader.asInstanceOf[js.Any], variantOutlined = variantOutlined.asInstanceOf[js.Any], variantPlain = variantPlain.asInstanceOf[js.Any], variantSoft = variantSoft.asInstanceOf[js.Any], variantSolid = variantSolid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableClasses] (val x: Self) extends AnyVal {
      
      inline def setBorderAxisBoth(value: String): Self = StObject.set(x, "borderAxisBoth", value.asInstanceOf[js.Any])
      
      inline def setBorderAxisBothBetween(value: String): Self = StObject.set(x, "borderAxisBothBetween", value.asInstanceOf[js.Any])
      
      inline def setBorderAxisNone(value: String): Self = StObject.set(x, "borderAxisNone", value.asInstanceOf[js.Any])
      
      inline def setBorderAxisX(value: String): Self = StObject.set(x, "borderAxisX", value.asInstanceOf[js.Any])
      
      inline def setBorderAxisXBetween(value: String): Self = StObject.set(x, "borderAxisXBetween", value.asInstanceOf[js.Any])
      
      inline def setBorderAxisY(value: String): Self = StObject.set(x, "borderAxisY", value.asInstanceOf[js.Any])
      
      inline def setBorderAxisYBetween(value: String): Self = StObject.set(x, "borderAxisYBetween", value.asInstanceOf[js.Any])
      
      inline def setColorContext(value: String): Self = StObject.set(x, "colorContext", value.asInstanceOf[js.Any])
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setHoverRow(value: String): Self = StObject.set(x, "hoverRow", value.asInstanceOf[js.Any])
      
      inline def setNoWrap(value: String): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeLg(value: String): Self = StObject.set(x, "sizeLg", value.asInstanceOf[js.Any])
      
      inline def setSizeMd(value: String): Self = StObject.set(x, "sizeMd", value.asInstanceOf[js.Any])
      
      inline def setSizeSm(value: String): Self = StObject.set(x, "sizeSm", value.asInstanceOf[js.Any])
      
      inline def setStickyHeader(value: String): Self = StObject.set(x, "stickyHeader", value.asInstanceOf[js.Any])
      
      inline def setVariantOutlined(value: String): Self = StObject.set(x, "variantOutlined", value.asInstanceOf[js.Any])
      
      inline def setVariantPlain(value: String): Self = StObject.set(x, "variantPlain", value.asInstanceOf[js.Any])
      
      inline def setVariantSoft(value: String): Self = StObject.set(x, "variantSoft", value.asInstanceOf[js.Any])
      
      inline def setVariantSolid(value: String): Self = StObject.set(x, "variantSolid", value.asInstanceOf[js.Any])
    }
  }
}
