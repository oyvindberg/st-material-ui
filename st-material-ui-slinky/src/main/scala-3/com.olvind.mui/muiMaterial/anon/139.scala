package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.tabsTabsMod.TabsProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `139` extends StObject {
  
  var defaultProps: js.UndefOr[
    com.olvind.mui.std.Partial[
      TabsProps[
        js.Function1[
          /* props */ OverridePropsExtendButtonBaseTypeMapButtAccessKey | DefaultComponentPropsExtendButtonBaseTypAriacontrols, 
          ReactElement | Null
        ], 
        js.Object
      ]
    ]
  ] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTabsClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartial]] = js.undefined
}
object `139` {
  
  inline def apply(): `139` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`139`]
  }
  
  extension [Self <: `139`](x: Self) {
    
    inline def setDefaultProps(
      value: com.olvind.mui.std.Partial[
          TabsProps[
            js.Function1[
              /* props */ OverridePropsExtendButtonBaseTypeMapButtAccessKey | DefaultComponentPropsExtendButtonBaseTypAriacontrols, 
              ReactElement | Null
            ], 
            js.Object
          ]
        ]
    ): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesTabsClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartial]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartial*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
