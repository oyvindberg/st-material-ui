package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.listItemSecondaryActionListItemSecondaryActionClassesMod.ListItemSecondaryActionClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `99`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemSecondaryActionProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[
      OverridesStyleRules[ListItemSecondaryActionClassKey, "MuiListItemSecondaryAction", Theme]
    ]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemSecondaryActionProps]] = js.undefined
}
object `99` {
  
  inline def apply[Theme](): `99`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`99`[Theme]]
  }
  
  extension [Self <: `99`[?], Theme](x: Self & `99`[Theme]) {
    
    inline def setDefaultProps(value: PartialListItemSecondaryActionProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[
          OverridesStyleRules[ListItemSecondaryActionClassKey, "MuiListItemSecondaryAction", Theme]
        ]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListItemSecondaryActionProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListItemSecondaryActionProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
