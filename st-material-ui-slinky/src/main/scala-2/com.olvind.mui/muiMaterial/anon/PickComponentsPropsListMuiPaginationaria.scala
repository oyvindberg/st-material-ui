package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.first
import com.olvind.mui.muiMaterial.muiMaterialStrings.last
import com.olvind.mui.muiMaterial.muiMaterialStrings.next
import com.olvind.mui.muiMaterial.muiMaterialStrings.page
import com.olvind.mui.muiMaterial.muiMaterialStrings.previous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@mui/material.@mui/material/styles/props.ComponentsPropsList['MuiPagination'], 'aria-label' | 'getItemAriaLabel'> */
@js.native
trait PickComponentsPropsListMuiPaginationaria extends StObject {
  
  var `aria-label`: js.UndefOr[String] = js.native
  
  var getItemAriaLabel: js.UndefOr[
    js.Function3[
      /* type */ page | first | last | next | previous, 
      /* page */ Double, 
      /* selected */ Boolean, 
      String
    ]
  ] = js.native
}
object PickComponentsPropsListMuiPaginationaria {
  
  @scala.inline
  def apply(): PickComponentsPropsListMuiPaginationaria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickComponentsPropsListMuiPaginationaria]
  }
  
  @scala.inline
  implicit class PickComponentsPropsListMuiPaginationariaMutableBuilder[Self <: PickComponentsPropsListMuiPaginationaria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    @scala.inline
    def setGetItemAriaLabel(
      value: (/* type */ page | first | last | next | previous, /* page */ Double, /* selected */ Boolean) => String
    ): Self = StObject.set(x, "getItemAriaLabel", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetItemAriaLabelUndefined: Self = StObject.set(x, "getItemAriaLabel", js.undefined)
  }
}
