package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.tabsTabsMod.TabsProps
import com.olvind.mui.muiStyledEngine.mod.Interpolation
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialStyleInterpolation extends StObject {
  
  var props: com.olvind.mui.std.Partial[
    TabsProps[
      js.Function1[
        /* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
        Element | Null
      ], 
      js.Object
    ]
  ]
  
  var style: Interpolation[Theme]
}
object PropsPartialStyleInterpolation {
  
  inline def apply(
    props: com.olvind.mui.std.Partial[
      TabsProps[
        js.Function1[
          /* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
          Element | Null
        ], 
        js.Object
      ]
    ]
  ): PropsPartialStyleInterpolation = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialStyleInterpolation]
  }
  
  extension [Self <: PropsPartialStyleInterpolation](x: Self) {
    
    inline def setProps(
      value: com.olvind.mui.std.Partial[
          TabsProps[
            js.Function1[
              /* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
              Element | Null
            ], 
            js.Object
          ]
        ]
    ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
