package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonGroupToggleButtonGroupClassesMod {
  
  @JSImport("@mui/material/ToggleButtonGroup/toggleButtonGroupClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ToggleButtonGroup/toggleButtonGroupClasses", JSImport.Default)
  @js.native
  val default: ToggleButtonGroupClasses = js.native
  
  inline def getToggleButtonGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getToggleButtonGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ToggleButtonGroupClassKey = "root" | "vertical" | "disabled" | "grouped" | "groupedHorizontal" | "groupedVertical"
  
  trait ToggleButtonGroupClasses extends StObject {
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** Styles applied to the children. */
    var grouped: String
    
    /** Styles applied to the children if `orientation="horizontal"`. */
    var groupedHorizontal: String
    
    /** Styles applied to the children if `orientation="vertical"`. */
    var groupedVertical: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var vertical: String
  }
  object ToggleButtonGroupClasses {
    
    inline def apply(
      disabled: String,
      grouped: String,
      groupedHorizontal: String,
      groupedVertical: String,
      root: String,
      vertical: String
    ): ToggleButtonGroupClasses = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], grouped = grouped.asInstanceOf[js.Any], groupedHorizontal = groupedHorizontal.asInstanceOf[js.Any], groupedVertical = groupedVertical.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleButtonGroupClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToggleButtonGroupClasses] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setGrouped(value: String): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
      
      inline def setGroupedHorizontal(value: String): Self = StObject.set(x, "groupedHorizontal", value.asInstanceOf[js.Any])
      
      inline def setGroupedVertical(value: String): Self = StObject.set(x, "groupedVertical", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
