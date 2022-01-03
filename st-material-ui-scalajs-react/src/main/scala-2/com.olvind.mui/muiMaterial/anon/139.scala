package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.tabsTabsMod.TabsProps
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `139` extends StObject {
  
  var defaultProps: js.UndefOr[
    com.olvind.mui.std.Partial[
      TabsProps[
        js.Function1[
          /* props */ OverridePropsExtendButtonBaseTypeMapButtAccessKey | DefaultComponentPropsExtendButtonBaseTypAriacontrols, 
          Element | Null
        ], 
        js.Object
      ]
    ]
  ] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTabsClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartial]] = js.native
}
object `139` {
  
  @scala.inline
  def apply(): `139` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`139`]
  }
  
  @scala.inline
  implicit class `139MutableBuilder`[Self <: `139`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(
      value: com.olvind.mui.std.Partial[
          TabsProps[
            js.Function1[
              /* props */ OverridePropsExtendButtonBaseTypeMapButtAccessKey | DefaultComponentPropsExtendButtonBaseTypAriacontrols, 
              Element | Null
            ], 
            js.Object
          ]
        ]
    ): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesTabsClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartial]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartial*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
