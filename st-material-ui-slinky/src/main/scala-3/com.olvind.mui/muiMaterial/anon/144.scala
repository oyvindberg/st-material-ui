package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.tabsTabsClassesMod.TabsClassKey
import com.olvind.mui.muiMaterial.tabsTabsMod.TabsProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `144`[Theme] extends StObject {
  
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
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[TabsClassKey, "MuiTabs", Theme]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartial]] = js.undefined
}
object `144` {
  
  inline def apply[Theme](): `144`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`144`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `144`[?], Theme] (val x: Self & `144`[Theme]) extends AnyVal {
    
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
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[TabsClassKey, "MuiTabs", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartial]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartial*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
