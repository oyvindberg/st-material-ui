package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.tabsTabsMod.TabsProps
import com.olvind.mui.muiStyledEngine.mod.Interpolation
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleInterpolation extends StObject {
  
  var props: com.olvind.mui.std.Partial[
    TabsProps[
      js.Function1[
        /* props */ OverridePropsExtendButtonBaseTypeMapButtAccessKey | DefaultComponentPropsExtendButtonBaseTypAriacontrols, 
        ReactElement | Null
      ], 
      js.Object
    ]
  ]
  
  var style: Interpolation[Theme]
}
object StyleInterpolation {
  
  inline def apply(
    props: com.olvind.mui.std.Partial[
      TabsProps[
        js.Function1[
          /* props */ OverridePropsExtendButtonBaseTypeMapButtAccessKey | DefaultComponentPropsExtendButtonBaseTypAriacontrols, 
          ReactElement | Null
        ], 
        js.Object
      ]
    ]
  ): StyleInterpolation = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleInterpolation]
  }
  
  extension [Self <: StyleInterpolation](x: Self) {
    
    inline def setProps(
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
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
