package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.tabsTabsMod.TabsProps
import com.olvind.mui.muiStyledEngine.mod.Interpolation
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsPartial extends StObject {
  
  var props: com.olvind.mui.std.Partial[
    TabsProps[
      js.Function1[
        /* props */ OverridePropsExtendButtonBaseTypeMapButtAccessKey | DefaultComponentPropsExtendButtonBaseTypAriacontrols, 
        ReactElement | Null
      ], 
      js.Object
    ]
  ] = js.native
  
  var style: Interpolation[Theme] = js.native
}
object PropsPartial {
  
  @scala.inline
  def apply(
    props: com.olvind.mui.std.Partial[
      TabsProps[
        js.Function1[
          /* props */ OverridePropsExtendButtonBaseTypeMapButtAccessKey | DefaultComponentPropsExtendButtonBaseTypAriacontrols, 
          ReactElement | Null
        ], 
        js.Object
      ]
    ]
  ): PropsPartial = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartial]
  }
  
  @scala.inline
  implicit class PropsPartialMutableBuilder[Self <: PropsPartial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(
      value: com.olvind.mui.std.Partial[
          TabsProps[
            js.Function1[
              /* props */ OverridePropsExtendButtonBaseTypeMapButtAccessKey | DefaultComponentPropsExtendButtonBaseTypAriacontrols, 
              ReactElement | Null
            ], 
            js.Object
          ]
        ]
    ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
