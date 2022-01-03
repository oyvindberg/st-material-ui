package com.olvind.mui.emotionReact

import com.olvind.mui.emotionSerialize.mod.CSSInterpolation
import com.olvind.mui.emotionSerialize.mod.Interpolation
import com.olvind.mui.std.TemplateStringsArray
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emotionReactMod {
  
  type ClassNamesArg = js.UndefOr[Null | String | Boolean | (StringDictionary[js.UndefOr[Boolean | Null]]) | Any]
  
  @js.native
  trait ClassNamesContent extends StObject {
    
    def css(args: CSSInterpolation*): String = js.native
    def css(template: TemplateStringsArray, args: CSSInterpolation*): String = js.native
    
    def cx(args: ClassNamesArg*): String = js.native
    
    var theme: Theme = js.native
  }
  
  trait ClassNamesProps extends StObject {
    
    def children(content: ClassNamesContent): Node
  }
  object ClassNamesProps {
    
    inline def apply(children: ClassNamesContent => Node): ClassNamesProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ClassNamesProps]
    }
    
    extension [Self <: ClassNamesProps](x: Self) {
      
      inline def setChildren(value: ClassNamesContent => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait GlobalProps extends StObject {
    
    var styles: Interpolation[Theme]
  }
  object GlobalProps {
    
    inline def apply(): GlobalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalProps]
    }
    
    extension [Self <: GlobalProps](x: Self) {
      
      inline def setStyles(value: Interpolation[Theme]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesNull: Self = StObject.set(x, "styles", null)
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait Theme extends StObject
}
