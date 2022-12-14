package com.olvind.mui.propTypes

import com.olvind.mui.std.NonNullable
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type ReactComponentLike = String | (js.Function2[/* props */ Any, /* context */ js.UndefOr[Any], Any]) | (Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], Any])
  
  trait ReactElementLike extends StObject {
    
    var key: String | Double | Null
    
    var props: Any
    
    var `type`: ReactComponentLike
  }
  object ReactElementLike {
    
    inline def apply(props: Any, `type`: ReactComponentLike): ReactElementLike = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactElementLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactElementLike] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setType(value: ReactComponentLike): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeFunction2(value: (/* props */ Any, /* context */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "type", js.Any.fromFunction2(value))
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ReactNodeLike = {} | prop-types.prop-types.ReactElementLike | prop-types.prop-types.ReactNodeArray | string | number | boolean | null | undefined
  }}}
  to avoid circular code involving: 
  - prop-types.prop-types.ReactNodeArray
  - prop-types.prop-types.ReactNodeLike
  */
  type ReactNodeLike = js.UndefOr[js.Object | ReactElementLike | Any | String | Double | Boolean | Null]
  
  @js.native
  trait Requireable[T]
    extends StObject
       with Validator[js.UndefOr[T | Null]] {
    
    def isRequired(
      props: StringDictionary[Any],
      propName: String,
      componentName: String,
      location: String,
      propFullName: String
    ): js.Error | Null = js.native
    @JSName("isRequired")
    var isRequired_Original: Validator[NonNullable[T]] = js.native
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]:? prop-types.prop-types.Validator<T[K]>}
    }}}
    */
  @js.native
  trait ValidationMap[T] extends StObject
  
  @js.native
  trait Validator[T] extends StObject {
    
    def apply(
      props: StringDictionary[Any],
      propName: String,
      componentName: String,
      location: String,
      propFullName: String
    ): js.Error | Null = js.native
  }
}
