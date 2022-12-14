package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.stylesTypesUtilsMod.OverridableRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesTypesZIndexMod {
  
  trait DefaultZIndex extends StObject {
    
    var badge: Double
    
    var modal: Double
    
    /**
      * Including `Menu`, `Autocomplete`, `Select`
      */
    var popup: Double
    
    /**
      * For sticky `th` cells
      */
    var table: Double
    
    var tooltip: Double
  }
  object DefaultZIndex {
    
    inline def apply(badge: Double, modal: Double, popup: Double, table: Double, tooltip: Double): DefaultZIndex = {
      val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultZIndex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultZIndex] (val x: Self) extends AnyVal {
      
      inline def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setModal(value: Double): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setPopup(value: Double): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setTable(value: Double): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: Double): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
  
  type ZIndex = OverridableRecord[DefaultZIndex, ZIndexOverrides, Double]
  
  trait ZIndexOverrides extends StObject
}
