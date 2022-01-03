package com.olvind.mui.emotionReact

import com.olvind.mui.emotionSerialize.mod.CSSInterpolation
import com.olvind.mui.emotionSerialize.mod.Interpolation
import com.olvind.mui.std.TemplateStringsArray
import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait ClassNamesProps extends StObject {
    
    def children(content: ClassNamesContent): ReactElement = js.native
  }
  object ClassNamesProps {
    
    @scala.inline
    def apply(children: ClassNamesContent => ReactElement): ClassNamesProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ClassNamesProps]
    }
    
    @scala.inline
    implicit class ClassNamesPropsMutableBuilder[Self <: ClassNamesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ClassNamesContent => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait GlobalProps extends StObject {
    
    var styles: Interpolation[Theme] = js.native
  }
  object GlobalProps {
    
    @scala.inline
    def apply(): GlobalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalProps]
    }
    
    @scala.inline
    implicit class GlobalPropsMutableBuilder[Self <: GlobalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: Interpolation[Theme]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesNull: Self = StObject.set(x, "styles", null)
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait Theme extends StObject
}
